import React from 'react'
import styles from './Button.module.css'

const Button = () => {
  return (
    <div className='theButton'>
      <button className={styles.button}>login</button>
    </div>
  )
}

export default Button
